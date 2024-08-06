package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.domain.TPay;
import generator.service.TPayService;
import generator.mapper.TPayMapper;
import org.springframework.stereotype.Service;

/**
* @author PYY
* @description 针对表【t_pay(支付交易表)】的数据库操作Service实现
* @createDate 2024-07-15 15:32:25
*/
@Service
public class TPayServiceImpl extends ServiceImpl<TPayMapper, TPay>
    implements TPayService{

}




