(ns net.minecraft.item.ItemArrow
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemArrow]))

(defn ->item-arrow
  "Constructor."
  (^ItemArrow []
    (new ItemArrow )))

(defn create-arrow
  "world-in - `net.minecraft.world.World`
  stack - `net.minecraft.item.ItemStack`
  shooter - `net.minecraft.entity.EntityLivingBase`

  returns: `net.minecraft.entity.projectile.EntityArrow`"
  (^net.minecraft.entity.projectile.EntityArrow [^ItemArrow this ^net.minecraft.world.World world-in ^net.minecraft.item.ItemStack stack ^net.minecraft.entity.EntityLivingBase shooter]
    (-> this (.createArrow world-in stack shooter))))

(defn infinite?
  "stack - `net.minecraft.item.ItemStack`
  bow - `net.minecraft.item.ItemStack`
  player - `net.minecraft.entity.player.EntityPlayer`

  returns: `boolean`"
  (^Boolean [^ItemArrow this ^net.minecraft.item.ItemStack stack ^net.minecraft.item.ItemStack bow ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.isInfinite stack bow player))))

