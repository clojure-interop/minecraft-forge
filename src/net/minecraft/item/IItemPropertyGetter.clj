(ns net.minecraft.item.IItemPropertyGetter
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item IItemPropertyGetter]))

(defn apply
  "stack - `net.minecraft.item.ItemStack`
  world-in - `net.minecraft.world.World`
  entity-in - `net.minecraft.entity.EntityLivingBase`

  returns: `float`"
  (^Float [^IItemPropertyGetter this ^net.minecraft.item.ItemStack stack ^net.minecraft.world.World world-in ^net.minecraft.entity.EntityLivingBase entity-in]
    (-> this (.apply stack world-in entity-in))))

