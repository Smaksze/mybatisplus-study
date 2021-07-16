package com.sms.mpspringboot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * <p>
 *
 * </p>
 *
 * @author Administrator
 * @since 2020-09-22
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CommunityManage {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private Integer communityManageId;

    /**
     * 社区id
     */
    private Integer communityId;

    /**
     * 社区名称
     */
    private String name;

    /**
     * 社区地址
     */
    private String location;

    /**
     * 开发者id
     */
    private Integer developerId;


}
