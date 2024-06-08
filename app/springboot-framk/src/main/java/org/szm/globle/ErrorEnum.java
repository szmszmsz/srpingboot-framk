//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.szm.globle;

public enum ErrorEnum {
    NO_PERMISSION(-1, "没有权限"),
    SUCCESS(0, "成功"),
    FAIL(1, "失败"),
    LOGIN(2, "请登录"),
    REQUEST_PATH_IS_ERROR(3, "请求路径错误"),
    ILLEGAL_PARAM(4, "非法参数"),
    NO_SUCH_FIELD(5, "没有改字段"),
    ILLEGAL_ACCESS(6, "非法访问"),
    FILTER_CONDITION_ERROR(7, "过滤条件格式错误,请检查"),
    RULE_ERROR(8, "过滤规则格式错误,请检查"),
    UNAUTHORIZED(9, "无凭证");

    private int code;
    private String msg;

    private ErrorEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static String getErrorMsg(int code) {
        ErrorEnum[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            ErrorEnum errorCode = var1[var3];
            if (errorCode.code == code) {
                return errorCode.msg;
            }
        }

        return null;
    }

    public static Integer getErrorCode(String msg) {
        ErrorEnum[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            ErrorEnum errorCode = var1[var3];
            if (errorCode.msg.equals(msg)) {
                return errorCode.code;
            }
        }

        return null;
    }
}
