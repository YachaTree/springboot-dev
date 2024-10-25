package com.ohgiraffers.demoelasticbeanstalk.menu.dto;


import com.ohgiraffers.demoelasticbeanstalk.menu.entity.Menu;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MenuDto {

    private Long menuCode;

    private String menuName;

    private int menuPrice;

    private int categoryCode;

    private String orderableStatus;

    @Builder
    public MenuDto(Long menuCode, String menuName, int menuPrice, int categoryCode, String orderableStatus) {
        this.menuCode = menuCode;
        this.menuName = menuName;
        this.menuPrice = menuPrice;
        this.categoryCode = categoryCode;
        this.orderableStatus = orderableStatus;
    }

    @Builder
    public MenuDto(Menu menuDto) {
        this.menuCode = menuDto.getMenuCode();
        this.menuName = menuDto.getMenuName();
        this.menuPrice = menuDto.getMenuPrice();
        this.categoryCode = menuDto.getCategoryCode();
        this.orderableStatus = menuDto.getOrderableStatus();
    }


}
