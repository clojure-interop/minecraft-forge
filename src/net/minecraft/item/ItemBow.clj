(ns net.minecraft.item.ItemBow
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemBow]))

(defn ->item-bow
  "Constructor."
  (^ItemBow []
    (new ItemBow )))

(defn *get-arrow-velocity
  "charge - `int`

  returns: `float`"
  (^Float [^Integer charge]
    (ItemBow/getArrowVelocity charge)))

(defn on-player-stopped-using
  "stack - `net.minecraft.item.ItemStack`
  world-in - `net.minecraft.world.World`
  entity-living - `net.minecraft.entity.EntityLivingBase`
  time-left - `int`"
  ([^ItemBow this ^net.minecraft.item.ItemStack stack ^net.minecraft.world.World world-in ^net.minecraft.entity.EntityLivingBase entity-living ^Integer time-left]
    (-> this (.onPlayerStoppedUsing stack world-in entity-living time-left))))

(defn get-max-item-use-duration
  "stack - `net.minecraft.item.ItemStack`

  returns: `int`"
  (^Integer [^ItemBow this ^net.minecraft.item.ItemStack stack]
    (-> this (.getMaxItemUseDuration stack))))

(defn get-item-use-action
  "stack - `net.minecraft.item.ItemStack`

  returns: `net.minecraft.item.EnumAction`"
  (^net.minecraft.item.EnumAction [^ItemBow this ^net.minecraft.item.ItemStack stack]
    (-> this (.getItemUseAction stack))))

(defn on-item-right-click
  "world-in - `net.minecraft.world.World`
  player-in - `net.minecraft.entity.player.EntityPlayer`
  hand-in - `net.minecraft.util.EnumHand`

  returns: `net.minecraft.util.ActionResult<net.minecraft.item.ItemStack>`"
  (^net.minecraft.util.ActionResult [^ItemBow this ^net.minecraft.world.World world-in ^net.minecraft.entity.player.EntityPlayer player-in ^net.minecraft.util.EnumHand hand-in]
    (-> this (.onItemRightClick world-in player-in hand-in))))

(defn get-item-enchantability
  "returns: `int`"
  (^Integer [^ItemBow this]
    (-> this (.getItemEnchantability))))

