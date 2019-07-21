(ns net.minecraftforge.event.entity.player.ItemTooltipEvent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.player ItemTooltipEvent]))

(defn ->item-tooltip-event
  "Constructor.

  This event is fired in ItemStack.getTooltip(EntityPlayer, boolean), which in turn is called from it's respective GUIContainer.

  item-stack - `net.minecraft.item.ItemStack`
  entity-player - `net.minecraft.entity.player.EntityPlayer`
  tool-tip - `java.util.List`
  show-advanced-item-tooltips - `boolean`"
  (^ItemTooltipEvent [^net.minecraft.item.ItemStack item-stack ^net.minecraft.entity.player.EntityPlayer entity-player ^java.util.List tool-tip ^Boolean show-advanced-item-tooltips]
    (new ItemTooltipEvent item-stack entity-player tool-tip show-advanced-item-tooltips)))

(defn show-advanced-item-tooltips?
  "Whether the advanced information on item tooltips is being shown, toggled by F3+H.

  returns: `boolean`"
  (^Boolean [^ItemTooltipEvent this]
    (-> this (.isShowAdvancedItemTooltips))))

(defn get-item-stack
  "The ItemStack with the tooltip.

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^ItemTooltipEvent this]
    (-> this (.getItemStack))))

(defn get-tool-tip
  "The ItemStack tooltip.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^ItemTooltipEvent this]
    (-> this (.getToolTip))))

