package com.hardware.charging.pojo.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;
@Data
@NoArgsConstructor
@Accessors(chain = true)
public class ChargingPile extends ModelBase implements Serializable {
    /**
    * 充电桩编号
     *
     * @mbg.generated
     */
    private String chargingPileSerialNumber;

    /**
    * 车场id
     *
     * @mbg.generated
     */
    private Integer parkingId;

    /**
    * 车位id
     *
     * @mbg.generated
     */
    private Integer parkingPlaceId;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", chargingPileSerialNumber=").append(chargingPileSerialNumber);
        sb.append(", parkingId=").append(parkingId);
        sb.append(", parkingPlaceId=").append(parkingPlaceId);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", createUserId=").append(createUserId);
        sb.append(", updateUserId=").append(updateUserId);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}