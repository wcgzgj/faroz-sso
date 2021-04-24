package sso.resp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName CommonResp
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/24 下午4:41
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResp<T> {
    /**
     * 返回是否成功
     */
    private boolean isSuccess=true;

    /**
     * 返回失败时，返回的错误信息
     */
    private String message;

    /**
     * 返回成功的时候，返回的内容
     */
    private T content;
}
