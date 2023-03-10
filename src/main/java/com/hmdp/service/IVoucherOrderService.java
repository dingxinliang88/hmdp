package com.hmdp.service;

import com.hmdp.model.dto.Result;
import com.hmdp.model.entity.VoucherOrder;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author codejuzi
 */
public interface IVoucherOrderService extends IService<VoucherOrder> {

    /**
     * 抢购秒杀券
     *
     * @param voucherId 秒杀券ID
     * @return 结果
     */
    Result seckillVoucher(Long voucherId);

    void handlerVoucherOrder(VoucherOrder voucherOrder);

    /**
     * 创建订单
     *
     * @param voucherOrder
     */
    void createVoucherOrder(VoucherOrder voucherOrder);
}
