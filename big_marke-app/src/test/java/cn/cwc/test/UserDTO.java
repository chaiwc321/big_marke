package cn.cwc.test;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j // 记录日志
@Data  // 一次性生成getter setter equalsAndHashcode toString
@Builder // 在对象内部生成静态内部类
@AllArgsConstructor // 有参构造函数
@NoArgsConstructor  // 无参构造函数
public class UserDTO {
    private String userId;
    private String userName;
    private Integer userAge;
}
