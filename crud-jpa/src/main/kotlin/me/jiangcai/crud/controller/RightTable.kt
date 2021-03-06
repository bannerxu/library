package me.jiangcai.crud.controller

/**
 * 权利表，若权利为空则表示允许所有
 * @author CJ
 */
data class RightTable(
    /**
     * 阅读的所需权利
     */
    val read: Right? = null,
    /**
     * 如果定义了这个参数，则[read]就不再有任何作用。
     * * [Pair.first] 表示以列表获取的所需权利
     * * [Pair.second] 表示以单独获取的所需权利
     */
    val readRights: Pair<Right?, Right?>? = null,
    /**
     * 创建的所需权利
     */
    val create: Right? = null,
    /**
     * 更新的所需权利
     */
    val update: Right? = null,
    /**
     * 更新具体字段的所需权利，如果要更新时却没有在这里找到所需权利，则匹配[update]
     */
    val updateProperty: Map<String, Right?> = emptyMap(),
    /**
     * 删除的所需权利
     */
    val delete: Right? = null
)