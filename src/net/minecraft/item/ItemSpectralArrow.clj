(ns net.minecraft.item.ItemSpectralArrow
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemSpectralArrow]))

(defn ->item-spectral-arrow
  "Constructor."
  (^ItemSpectralArrow []
    (new ItemSpectralArrow )))

(defn create-arrow
  "world-in - `net.minecraft.world.World`
  stack - `net.minecraft.item.ItemStack`
  shooter - `net.minecraft.entity.EntityLivingBase`

  returns: `net.minecraft.entity.projectile.EntityArrow`"
  (^net.minecraft.entity.projectile.EntityArrow [^ItemSpectralArrow this ^net.minecraft.world.World world-in ^net.minecraft.item.ItemStack stack ^net.minecraft.entity.EntityLivingBase shooter]
    (-> this (.createArrow world-in stack shooter))))

