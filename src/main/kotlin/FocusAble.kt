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
 * @FileName    : FocusAble
 * @Date        : 2022-04-22
 * @author      : haeseoky@gmail.com
 * @description :
 */
interface FocusAble {
    fun setFocus(b: Boolean) = println("I ${if (b) "got" else "lost"} focus")
    fun showOff() = println("FocusAble showOff interface")
}