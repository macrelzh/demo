package generate;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * get_and_set
 * @author 
 */
@Data
public class GetAndSet implements Serializable {
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 测试自增数
     */
    private Long targetId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updatedAt;

    private static final long serialVersionUID = 1L;
}