/***************************************************
 * Copyright(c) 2021-2022 Ocean All right reserved.
 * This software is the proprietary information of Ocean.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * haeseoky@gmail.com             2022-04-22       First Draft.
 *
 ****************************************************/
/**
 * @Project     : ocean
 * @FileName    : Button
 * @Date        : 2022-04-22
 * @author      : haeseoky@gmail.com
 * @description :
 */
class Button : Clickable, FocusAble {
    override fun click() = println("Button click")
    override fun showOff() = super<FocusAble>.showOff()
}