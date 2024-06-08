//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.szm.globle;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(
    value = "查看接口返回数据",
    description = "测试接口返回数据"
)
public class Response<V> implements Serializable {
    private static final long serialVersionUID = 8328597887906020162L;
    @ApiModelProperty(
        example = "成功"
    )
    public static final int SUCCESS_CODE;
    @ApiModelProperty(
        example = "失败"
    )
    public static final int FAILURE_CODE;
    @ApiModelProperty(
        example = "状态码"
    )
    private int errorCode;
    @ApiModelProperty(
        example = "返回信息"
    )
    private String message;
    @ApiModelProperty(
        example = "时间"
    )
    private long time;
    @ApiModelProperty(
        example = "返回参数"
    )
    private V responseBody;
    @ApiModelProperty(
        example = "日志"
    )
    private Object logInfo;

    public static <V> Response<V> success(V data) {
        return (new Response()).setErrorCode(ErrorEnum.SUCCESS.getCode()).setMessage(ErrorEnum.SUCCESS.getMsg()).setTime(System.currentTimeMillis()).setResponseBody(data);
    }

    public static <V> Response<V> success(V data, Object logInfo) {
        return (new Response()).setErrorCode(ErrorEnum.SUCCESS.getCode()).setMessage(ErrorEnum.SUCCESS.getMsg()).setTime(System.currentTimeMillis()).setResponseBody(data).setLogInfo(logInfo);
    }

    public static Response<Object> success() {
        return (new Response()).setErrorCode(ErrorEnum.SUCCESS.getCode()).setMessage(ErrorEnum.SUCCESS.getMsg()).setTime(System.currentTimeMillis());
    }

    public static Response<Object> fail() {
        return (new Response()).setErrorCode(ErrorEnum.FAIL.getCode()).setMessage(ErrorEnum.FAIL.getMsg()).setTime(System.currentTimeMillis());
    }

    public static Response<Object> fail(String errorMsg) {
        return (new Response()).setErrorCode(ErrorEnum.FAIL.getCode()).setMessage(ErrorEnum.FAIL.getMsg()).setTime(System.currentTimeMillis()).setResponseBody(errorMsg);
    }

    public static Response<Object> response(int code, String message) {
        return (new Response()).setErrorCode(code).setMessage(message).setTime(System.currentTimeMillis());
    }

    public static Response<Object> response(int code, String message, Object logInfo) {
        return (new Response()).setErrorCode(code).setMessage(message).setTime(System.currentTimeMillis()).setLogInfo(logInfo);
    }

    public static Response<Object> response(int code) {
        String errorMsg = ErrorEnum.getErrorMsg(code);
        return (new Response()).setErrorCode(code).setMessage(errorMsg == null ? "错误" : errorMsg).setTime(System.currentTimeMillis());
    }

    public static Response<Object> response(String msg) {
        Integer errorCode = ErrorEnum.getErrorCode(msg);
        return (new Response()).setErrorCode(errorCode == null ? 500 : errorCode).setMessage(msg).setTime(System.currentTimeMillis());
    }

    public Response(int errorCode, String message, V ResponseTestBody, Object logInfo) {
        this.errorCode = errorCode;
        this.message = message;
        this.responseBody = ResponseTestBody;
        this.logInfo = logInfo;
        this.time = System.currentTimeMillis();
    }

    public Response(int errorCode, String message, V ResponseTestBody) {
        this.errorCode = errorCode;
        this.message = message;
        this.responseBody = ResponseTestBody;
        this.time = System.currentTimeMillis();
    }

    public Response(int errorCode, V ResponseTestBody) {
        this.errorCode = errorCode;
        if (errorCode == ErrorEnum.SUCCESS.getCode()) {
            this.message = ErrorEnum.SUCCESS.getMsg();
        } else {
            this.message = ResponseTestBody.toString();
        }

        this.responseBody = ResponseTestBody;
        this.time = System.currentTimeMillis();
    }

    public static <V> Response<V> successResponseTest(V ResponseTestBody, Object logInfo) {
        return new Response(ErrorEnum.SUCCESS.getCode(), ErrorEnum.SUCCESS.getMsg(), ResponseTestBody, logInfo);
    }

    public Response() {
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getMessage() {
        return this.message;
    }

    public long getTime() {
        return this.time;
    }

    public V getResponseBody() {
        return this.responseBody;
    }

    public Object getLogInfo() {
        return this.logInfo;
    }

    public Response<V> setErrorCode(final int errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public Response<V> setMessage(final String message) {
        this.message = message;
        return this;
    }

    public Response<V> setTime(final long time) {
        this.time = time;
        return this;
    }

    public Response<V> setResponseBody(final V responseBody) {
        this.responseBody = responseBody;
        return this;
    }

    public Response<V> setLogInfo(final Object logInfo) {
        this.logInfo = logInfo;
        return this;
    }

    public String toString() {
        return "Response(errorCode=" + this.getErrorCode() + ", message=" + this.getMessage() + ", time=" + this.getTime() + ", responseBody=" + this.getResponseBody() + ", logInfo=" + this.getLogInfo() + ")";
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Response)) {
            return false;
        } else {
            Response<?> other = (Response)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getErrorCode() != other.getErrorCode()) {
                return false;
            } else if (this.getTime() != other.getTime()) {
                return false;
            } else {
                label52: {
                    Object this$message = this.getMessage();
                    Object other$message = other.getMessage();
                    if (this$message == null) {
                        if (other$message == null) {
                            break label52;
                        }
                    } else if (this$message.equals(other$message)) {
                        break label52;
                    }

                    return false;
                }

                Object this$responseBody = this.getResponseBody();
                Object other$responseBody = other.getResponseBody();
                if (this$responseBody == null) {
                    if (other$responseBody != null) {
                        return false;
                    }
                } else if (!this$responseBody.equals(other$responseBody)) {
                    return false;
                }

                Object this$logInfo = this.getLogInfo();
                Object other$logInfo = other.getLogInfo();
                if (this$logInfo == null) {
                    if (other$logInfo != null) {
                        return false;
                    }
                } else if (!this$logInfo.equals(other$logInfo)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Response;
    }

    public int hashCode() {
//        int PRIME = true;
        int result = 1;
        result = result * 59 + this.getErrorCode();
        long $time = this.getTime();
        result = result * 59 + (int)($time >>> 32 ^ $time);
        Object $message = this.getMessage();
        result = result * 59 + ($message == null ? 43 : $message.hashCode());
        Object $responseBody = this.getResponseBody();
        result = result * 59 + ($responseBody == null ? 43 : $responseBody.hashCode());
        Object $logInfo = this.getLogInfo();
        result = result * 59 + ($logInfo == null ? 43 : $logInfo.hashCode());
        return result;
    }

    static {
        SUCCESS_CODE = ErrorEnum.SUCCESS.getCode();
        FAILURE_CODE = ErrorEnum.FAIL.getCode();
    }
}
