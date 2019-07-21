(ns net.minecraft.item.ItemShield
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemShield]))

(defn ->item-shield
  "Constructor."
  (^ItemShield []
    (new ItemShield )))

(defn get-item-stack-display-name
  "stack - `net.minecraft.item.ItemStack`

  returns: `java.lang.String`"
  (^java.lang.String [^ItemShield this ^net.minecraft.item.ItemStack stack]
    (-> this (.getItemStackDisplayName stack))))

(defn add-information
  "stack - `net.minecraft.item.ItemStack`
  player-in - `net.minecraft.entity.player.EntityPlayer`
  tooltip - `java.util.List`
  advanced - `boolean`"
  ([^ItemShield this ^net.minecraft.item.ItemStack stack ^net.minecraft.entity.player.EntityPlayer player-in ^java.util.List tooltip ^Boolean advanced]
    (-> this (.addInformation stack player-in tooltip advanced))))

(defn get-sub-items
  "item-in - `net.minecraft.item.Item`
  tab - `net.minecraft.creativetab.CreativeTabs`
  sub-items - `net.minecraft.util.NonNullList`"
  ([^ItemShield this ^net.minecraft.item.Item item-in ^net.minecraft.creativetab.CreativeTabs tab ^net.minecraft.util.NonNullList sub-items]
    (-> this (.getSubItems item-in tab sub-items))))

(defn get-creative-tab
  "returns: `net.minecraft.creativetab.CreativeTabs`"
  (^net.minecraft.creativetab.CreativeTabs [^ItemShield this]
    (-> this (.getCreativeTab))))

(defn get-item-use-action
  "stack - `net.minecraft.item.ItemStack`

  returns: `net.minecraft.item.EnumAction`"
  (^net.minecraft.item.EnumAction [^ItemShield this ^net.minecraft.item.ItemStack stack]
    (-> this (.getItemUseAction stack))))

(defn get-max-item-use-duration
  "stack - `net.minecraft.item.ItemStack`

  returns: `int`"
  (^Integer [^ItemShield this ^net.minecraft.item.ItemStack stack]
    (-> this (.getMaxItemUseDuration stack))))

(defn on-item-right-click
  "world-in - `net.minecraft.world.World`
  player-in - `net.minecraft.entity.player.EntityPlayer`
  hand-in - `net.minecraft.util.EnumHand`

  returns: `net.minecraft.util.ActionResult<net.minecraft.item.ItemStack>`"
  (^net.minecraft.util.ActionResult [^ItemShield this ^net.minecraft.world.World world-in ^net.minecraft.entity.player.EntityPlayer player-in ^net.minecraft.util.EnumHand hand-in]
    (-> this (.onItemRightClick world-in player-in hand-in))))

(defn get-is-repairable?
  "to-repair - `net.minecraft.item.ItemStack`
  repair - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^ItemShield this ^net.minecraft.item.ItemStack to-repair ^net.minecraft.item.ItemStack repair]
    (-> this (.getIsRepairable to-repair repair))))

