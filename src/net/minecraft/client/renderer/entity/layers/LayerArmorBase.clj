(ns net.minecraft.client.renderer.entity.layers.LayerArmorBase
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity.layers LayerArmorBase]))

(defn ->layer-armor-base
  "Constructor.

  renderer-in - `net.minecraft.client.renderer.entity.RenderLivingBase`"
  (^LayerArmorBase [^net.minecraft.client.renderer.entity.RenderLivingBase renderer-in]
    (new LayerArmorBase renderer-in)))

(defn *render-enchanted-glint
  "p-188364-0 - `net.minecraft.client.renderer.entity.RenderLivingBase`
  p-188364-1 - `net.minecraft.entity.EntityLivingBase`
  model - `net.minecraft.client.model.ModelBase`
  p-188364-3 - `float`
  p-188364-4 - `float`
  p-188364-5 - `float`
  p-188364-6 - `float`
  p-188364-7 - `float`
  p-188364-8 - `float`
  p-188364-9 - `float`"
  ([^net.minecraft.client.renderer.entity.RenderLivingBase p-188364-0 ^net.minecraft.entity.EntityLivingBase p-188364-1 ^net.minecraft.client.model.ModelBase model ^Float p-188364-3 ^Float p-188364-4 ^Float p-188364-5 ^Float p-188364-6 ^Float p-188364-7 ^Float p-188364-8 ^Float p-188364-9]
    (LayerArmorBase/renderEnchantedGlint p-188364-0 p-188364-1 model p-188364-3 p-188364-4 p-188364-5 p-188364-6 p-188364-7 p-188364-8 p-188364-9)))

(defn do-render-layer
  "entitylivingbase-in - `net.minecraft.entity.EntityLivingBase`
  limb-swing - `float`
  limb-swing-amount - `float`
  partial-ticks - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale - `float`"
  ([^LayerArmorBase this ^net.minecraft.entity.EntityLivingBase entitylivingbase-in ^Float limb-swing ^Float limb-swing-amount ^Float partial-ticks ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale]
    (-> this (.doRenderLayer entitylivingbase-in limb-swing limb-swing-amount partial-ticks age-in-ticks net-head-yaw head-pitch scale))))

(defn should-combine-textures?
  "returns: `boolean`"
  (^Boolean [^LayerArmorBase this]
    (-> this (.shouldCombineTextures))))

(defn get-model-from-slot
  "slot-in - `net.minecraft.inventory.EntityEquipmentSlot`

  returns: `T`"
  ([^LayerArmorBase this ^net.minecraft.inventory.EntityEquipmentSlot slot-in]
    (-> this (.getModelFromSlot slot-in))))

(defn get-armor-resource
  "More generic ForgeHook version of the above function, it allows for Items to have more control over what texture they provide.

  entity - Entity wearing the armor - `net.minecraft.entity.Entity`
  stack - ItemStack for the armor - `net.minecraft.item.ItemStack`
  slot - Slot ID that the item is in - `net.minecraft.inventory.EntityEquipmentSlot`
  type - Subtype, can be null or \"overlay\" - `java.lang.String`

  returns: ResourceLocation pointing at the armor's texture - `net.minecraft.util.ResourceLocation`"
  (^net.minecraft.util.ResourceLocation [^LayerArmorBase this ^net.minecraft.entity.Entity entity ^net.minecraft.item.ItemStack stack ^net.minecraft.inventory.EntityEquipmentSlot slot ^java.lang.String type]
    (-> this (.getArmorResource entity stack slot type))))

