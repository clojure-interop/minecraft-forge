(ns net.minecraft.item.ItemPotion
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemPotion]))

(defn ->item-potion
  "Constructor."
  (^ItemPotion []
    (new ItemPotion )))

(defn get-item-stack-display-name
  "stack - `net.minecraft.item.ItemStack`

  returns: `java.lang.String`"
  (^java.lang.String [^ItemPotion this ^net.minecraft.item.ItemStack stack]
    (-> this (.getItemStackDisplayName stack))))

(defn on-item-use-finish
  "stack - `net.minecraft.item.ItemStack`
  world-in - `net.minecraft.world.World`
  entity-living - `net.minecraft.entity.EntityLivingBase`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^ItemPotion this ^net.minecraft.item.ItemStack stack ^net.minecraft.world.World world-in ^net.minecraft.entity.EntityLivingBase entity-living]
    (-> this (.onItemUseFinish stack world-in entity-living))))

(defn on-item-right-click
  "world-in - `net.minecraft.world.World`
  player-in - `net.minecraft.entity.player.EntityPlayer`
  hand-in - `net.minecraft.util.EnumHand`

  returns: `net.minecraft.util.ActionResult<net.minecraft.item.ItemStack>`"
  (^net.minecraft.util.ActionResult [^ItemPotion this ^net.minecraft.world.World world-in ^net.minecraft.entity.player.EntityPlayer player-in ^net.minecraft.util.EnumHand hand-in]
    (-> this (.onItemRightClick world-in player-in hand-in))))

(defn add-information
  "stack - `net.minecraft.item.ItemStack`
  player-in - `net.minecraft.entity.player.EntityPlayer`
  tooltip - `java.util.List`
  advanced - `boolean`"
  ([^ItemPotion this ^net.minecraft.item.ItemStack stack ^net.minecraft.entity.player.EntityPlayer player-in ^java.util.List tooltip ^Boolean advanced]
    (-> this (.addInformation stack player-in tooltip advanced))))

(defn get-max-item-use-duration
  "stack - `net.minecraft.item.ItemStack`

  returns: `int`"
  (^Integer [^ItemPotion this ^net.minecraft.item.ItemStack stack]
    (-> this (.getMaxItemUseDuration stack))))

(defn has-effect?
  "stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^ItemPotion this ^net.minecraft.item.ItemStack stack]
    (-> this (.hasEffect stack))))

(defn get-sub-items
  "item-in - `net.minecraft.item.Item`
  tab - `net.minecraft.creativetab.CreativeTabs`
  sub-items - `net.minecraft.util.NonNullList`"
  ([^ItemPotion this ^net.minecraft.item.Item item-in ^net.minecraft.creativetab.CreativeTabs tab ^net.minecraft.util.NonNullList sub-items]
    (-> this (.getSubItems item-in tab sub-items))))

(defn get-default-instance
  "returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^ItemPotion this]
    (-> this (.getDefaultInstance))))

(defn get-item-use-action
  "stack - `net.minecraft.item.ItemStack`

  returns: `net.minecraft.item.EnumAction`"
  (^net.minecraft.item.EnumAction [^ItemPotion this ^net.minecraft.item.ItemStack stack]
    (-> this (.getItemUseAction stack))))

