(ns net.minecraft.client.renderer.block.model.ItemOverrideList
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.block.model ItemOverrideList]))

(defn ->item-override-list
  "Constructor.

  overrides-in - `java.util.List`"
  (^ItemOverrideList [^java.util.List overrides-in]
    (new ItemOverrideList overrides-in)))

(def *-none
  "Static Constant.

  type: net.minecraft.client.renderer.block.model.ItemOverrideList"
  ItemOverrideList/NONE)

(defn apply-override
  "Deprecated.

  stack - `net.minecraft.item.ItemStack`
  world-in - `net.minecraft.world.World`
  entity-in - `net.minecraft.entity.EntityLivingBase`

  returns: `net.minecraft.util.ResourceLocation`"
  (^net.minecraft.util.ResourceLocation [^ItemOverrideList this ^net.minecraft.item.ItemStack stack ^net.minecraft.world.World world-in ^net.minecraft.entity.EntityLivingBase entity-in]
    (-> this (.applyOverride stack world-in entity-in))))

(defn handle-item-state
  "original-model - `net.minecraft.client.renderer.block.model.IBakedModel`
  stack - `net.minecraft.item.ItemStack`
  world - `net.minecraft.world.World`
  entity - `net.minecraft.entity.EntityLivingBase`

  returns: `net.minecraft.client.renderer.block.model.IBakedModel`"
  (^net.minecraft.client.renderer.block.model.IBakedModel [^ItemOverrideList this ^net.minecraft.client.renderer.block.model.IBakedModel original-model ^net.minecraft.item.ItemStack stack ^net.minecraft.world.World world ^net.minecraft.entity.EntityLivingBase entity]
    (-> this (.handleItemState original-model stack world entity))))

(defn get-overrides
  "returns: `com.google.common.collect.ImmutableList<net.minecraft.client.renderer.block.model.ItemOverride>`"
  (^com.google.common.collect.ImmutableList [^ItemOverrideList this]
    (-> this (.getOverrides))))

