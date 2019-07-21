(ns net.minecraft.item.ItemFood
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemFood]))

(defn ->item-food
  "Constructor.

  amount - `int`
  saturation - `float`
  is-wolf-food - `boolean`"
  (^ItemFood [^Integer amount ^Float saturation ^Boolean is-wolf-food]
    (new ItemFood amount saturation is-wolf-food))
  (^ItemFood [^Integer amount ^Boolean is-wolf-food]
    (new ItemFood amount is-wolf-food)))

(defn item-use-duration
  "Instance Constant.

  type: int"
  (^Integer [^ItemFood this]
    (-> this .-itemUseDuration)))

(defn get-heal-amount
  "stack - `net.minecraft.item.ItemStack`

  returns: `int`"
  (^Integer [^ItemFood this ^net.minecraft.item.ItemStack stack]
    (-> this (.getHealAmount stack))))

(defn wolfs-favorite-meat?
  "returns: `boolean`"
  (^Boolean [^ItemFood this]
    (-> this (.isWolfsFavoriteMeat))))

(defn on-item-use-finish
  "stack - `net.minecraft.item.ItemStack`
  world-in - `net.minecraft.world.World`
  entity-living - `net.minecraft.entity.EntityLivingBase`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^ItemFood this ^net.minecraft.item.ItemStack stack ^net.minecraft.world.World world-in ^net.minecraft.entity.EntityLivingBase entity-living]
    (-> this (.onItemUseFinish stack world-in entity-living))))

(defn on-item-right-click
  "world-in - `net.minecraft.world.World`
  player-in - `net.minecraft.entity.player.EntityPlayer`
  hand-in - `net.minecraft.util.EnumHand`

  returns: `net.minecraft.util.ActionResult<net.minecraft.item.ItemStack>`"
  (^net.minecraft.util.ActionResult [^ItemFood this ^net.minecraft.world.World world-in ^net.minecraft.entity.player.EntityPlayer player-in ^net.minecraft.util.EnumHand hand-in]
    (-> this (.onItemRightClick world-in player-in hand-in))))

(defn get-max-item-use-duration
  "stack - `net.minecraft.item.ItemStack`

  returns: `int`"
  (^Integer [^ItemFood this ^net.minecraft.item.ItemStack stack]
    (-> this (.getMaxItemUseDuration stack))))

(defn get-saturation-modifier
  "stack - `net.minecraft.item.ItemStack`

  returns: `float`"
  (^Float [^ItemFood this ^net.minecraft.item.ItemStack stack]
    (-> this (.getSaturationModifier stack))))

(defn set-always-edible
  "returns: `net.minecraft.item.ItemFood`"
  (^net.minecraft.item.ItemFood [^ItemFood this]
    (-> this (.setAlwaysEdible))))

(defn get-item-use-action
  "stack - `net.minecraft.item.ItemStack`

  returns: `net.minecraft.item.EnumAction`"
  (^net.minecraft.item.EnumAction [^ItemFood this ^net.minecraft.item.ItemStack stack]
    (-> this (.getItemUseAction stack))))

(defn set-potion-effect
  "effect - `net.minecraft.potion.PotionEffect`
  probability - `float`

  returns: `net.minecraft.item.ItemFood`"
  (^net.minecraft.item.ItemFood [^ItemFood this ^net.minecraft.potion.PotionEffect effect ^Float probability]
    (-> this (.setPotionEffect effect probability))))

