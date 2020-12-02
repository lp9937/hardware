package com.hardware.common.mbg.charging;

import com.hardware.common.constant.ResourceFileConstant;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.api.VerboseProgressCallback;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 用于生成充电桩代码
 * Created by lp on 2020/12/01
 */
public class Generator {
    public static void main(String[]args) throws
            IOException, XMLParserException,
            InvalidConfigurationException,
            SQLException, InterruptedException {
        //MBG执行过程中的告警信息
        List<String> warnings=new ArrayList<>();

        InputStream inputStream=
                Generator.class.getResourceAsStream(ResourceFileConstant.CHARGING_PILE_RESOURCE_FILE_PATH);
        ConfigurationParser parser=new ConfigurationParser(warnings);
        Configuration configuration=parser.parseConfiguration(inputStream);
        inputStream.close();
        //当生成的代码重复时，覆盖源代码
        DefaultShellCallback callback=new DefaultShellCallback(true);
        //创建MBG
        MyBatisGenerator myBatisGenerator=new MyBatisGenerator(configuration,callback,warnings);
        //执行生成代码
        myBatisGenerator.generate(new VerboseProgressCallback());
        //输出警告信息
        warnings.forEach(item->System.out.print(item));
    }
}
