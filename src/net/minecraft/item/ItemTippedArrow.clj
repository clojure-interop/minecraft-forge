(ns net.minecraft.item.ItemTippedArrow
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemTippedArrow]))

(defn ->item-tipped-arrow
  "Constructor."
  (^ItemTippedArrow []
    (new ItemTippedArrow )))

(defn get-default-instance
  "returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^ItemTippedArrow this]
    (-> this (.getDefaultInstance))))

(defn create-arrow
  "world-in - `net.minecraft.world.World`
  stack - `net.minecraft.item.ItemStack`
  shooter - `net.minecraft.entity.EntityLivingBase`

  returns: `net.minecraft.entity.projectile.EntityArrow`"
  (^net.minecraft.entity.projectile.EntityArrow [^ItemTippedArrow this ^net.minecraft.world.World world-in ^net.minecraft.item.ItemStack stack ^net.minecraft.entity.EntityLivingBase shooter]
    (-> this (.createArrow world-in stack shooter))))

(defn get-sub-items
  "item-in - `net.minecraft.item.Item`
  tab - `net.minecraft.creativetab.CreativeTabs`
  sub-items - `net.minecraft.util.NonNullList`"
  ([^ItemTippedArrow this ^net.minecraft.item.Item item-in ^net.minecraft.creativetab.CreativeTabs tab ^net.minecraft.util.NonNullList sub-items]
    (-> this (.getSubItems item-in tab sub-items))))

(defn add-information
  "stack - `net.minecraft.item.ItemStack`
  player-in - `net.minecraft.entity.player.EntityPlayer`
  tooltip - `java.util.List`
  advanced - `boolean`"
  ([^ItemTippedArrow this ^net.minecraft.item.ItemStack stack ^net.minecraft.entity.player.EntityPlayer player-in ^java.util.List tooltip ^Boolean advanced]
    (-> this (.addInformation stack player-in tooltip advanced))))

(defn get-item-stack-display-name
  "stack - `net.minecraft.item.ItemStack`

  returns: `java.lang.String`"
  (^java.lang.String [^ItemTippedArrow this ^net.minecraft.item.ItemStack stack]
    (-> this (.getItemStackDisplayName stack))))

