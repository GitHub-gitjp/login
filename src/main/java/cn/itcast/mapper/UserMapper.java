package cn.itcast.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import cn.itcast.domain.User;

public interface UserMapper {

	@Select("select * from personnel")
	List<User> getAllUsers();

	@Insert({
			"insert into personnel values( #{uname},#{uage},#{uaccount},#{to_work},#{off_work},#{is_out},#{is_leave},#{is_anager}, jdbcType=TIMESTAMP})" })
	int insertPer(User user);
}
