package com.hardware.common.mbg;

import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.CompilationUnit;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.InnerClass;
import org.mybatis.generator.internal.DefaultCommentGenerator;
import org.mybatis.generator.internal.util.StringUtility;

import java.util.Properties;
import java.util.Set;

public class CommentGenerator extends DefaultCommentGenerator {
    private boolean addRemarkComments=false;
    private static final String EXAMPLE_SUFFIX="Example";
    private static final String API_MODEL_PROPERTY_FULL_CLASS_NAME=
            "io.swagger.annotations.ApiModelProperty";
    private static final String JAVAX_PERSISTENCE_COLUMN_FULL_CLASS_NAME=
            "javax.persistence.Column";

    /**
     * 设置用户配置参数
     * @param properties
     */
    @Override
    public void addConfigurationProperties(Properties properties) {
        super.addConfigurationProperties(properties);
        this.addRemarkComments= StringUtility
                .isTrue(properties.getProperty("addRemarkComments"));
    }

    @Override
    public void addFieldComment(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
        String remarks= introspectedColumn.getRemarks();
        //根据参数和备注信息判断是否添加备注信息
        if(addRemarkComments&&StringUtility.stringHasValue(remarks)){
            addFieldJavaDoc(field,remarks);
            //数据库中特殊字符需要转义
            if(remarks.contains("\"")){
                remarks=remarks.replace("\"","'");
            }
//            String jdbcTypeName= introspectedColumn.getJdbcTypeName();
//            field.addJavaDocLine("@Column(columnDefinition=\""+jdbcTypeName+" comment '"+remarks+"'\")");
        }
    }

    /**
     * 给类添加注解
     * @param innerClass
     * @param introspectedTable
     * @param imports
     */
    @Override
    public void addClassAnnotation(InnerClass innerClass, IntrospectedTable introspectedTable, Set<FullyQualifiedJavaType> imports) {
        super.addClassAnnotation(innerClass, introspectedTable, imports);
        if(!innerClass.getType().getFullyQualifiedName().contains(EXAMPLE_SUFFIX)){
            innerClass.addAnnotation("@Data");
            innerClass.addAnnotation("@NoArgsConstructor");
            innerClass.addAnnotation("@Accessors(chain = true)");
        }
    }

    @Override
    public void addJavaFileComment(CompilationUnit compilationUnit) {
        super.addJavaFileComment(compilationUnit);
        //只在model中添加swagger注解类的导入
        if(!compilationUnit.isJavaInterface()&&!compilationUnit.getType()
                .getFullyQualifiedName().contains(EXAMPLE_SUFFIX)){
//            compilationUnit.addImportedType(
//                    new FullyQualifiedJavaType(JAVAX_PERSISTENCE_COLUMN_FULL_CLASS_NAME));
        }
    }

    /**
     * 给model字段添加注释
     * @param field
     * @param remarks
     */
    private void addFieldJavaDoc(Field field,String remarks){
        field.addJavaDocLine("/**");
        //获取数据库字段的备注
        String []remarkLines=remarks.split(System.getProperty("line.separator"));
        for(int i=0;i<remarkLines.length;++i){
            field.addJavaDocLine("* "+remarkLines[i]);
        }
        addJavadocTag(field,false);
        field.addJavaDocLine(" */");
    }
}
