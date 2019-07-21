(ns net.minecraft.client.renderer.ItemRenderer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer ItemRenderer]))

(defn ->item-renderer
  "Constructor.

  mc-in - `net.minecraft.client.Minecraft`"
  (^ItemRenderer [^net.minecraft.client.Minecraft mc-in]
    (new ItemRenderer mc-in)))

(defn render-item
  "entity-in - `net.minecraft.entity.EntityLivingBase`
  held-stack - `net.minecraft.item.ItemStack`
  transform - `net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType`"
  ([^ItemRenderer this ^net.minecraft.entity.EntityLivingBase entity-in ^net.minecraft.item.ItemStack held-stack ^net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType transform]
    (-> this (.renderItem entity-in held-stack transform))))

(defn render-item-side
  "entitylivingbase-in - `net.minecraft.entity.EntityLivingBase`
  held-stack - `net.minecraft.item.ItemStack`
  transform - `net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType`
  left-handed - `boolean`"
  ([^ItemRenderer this ^net.minecraft.entity.EntityLivingBase entitylivingbase-in ^net.minecraft.item.ItemStack held-stack ^net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType transform ^Boolean left-handed]
    (-> this (.renderItemSide entitylivingbase-in held-stack transform left-handed))))

(defn render-item-in-first-person
  "p-187457-1 - `net.minecraft.client.entity.AbstractClientPlayer`
  p-187457-2 - `float`
  p-187457-3 - `float`
  p-187457-4 - `net.minecraft.util.EnumHand`
  p-187457-5 - `float`
  p-187457-6 - `net.minecraft.item.ItemStack`
  p-187457-7 - `float`"
  ([^ItemRenderer this ^net.minecraft.client.entity.AbstractClientPlayer p-187457-1 ^Float p-187457-2 ^Float p-187457-3 ^net.minecraft.util.EnumHand p-187457-4 ^Float p-187457-5 ^net.minecraft.item.ItemStack p-187457-6 ^Float p-187457-7]
    (-> this (.renderItemInFirstPerson p-187457-1 p-187457-2 p-187457-3 p-187457-4 p-187457-5 p-187457-6 p-187457-7)))
  ([^ItemRenderer this ^Float partial-ticks]
    (-> this (.renderItemInFirstPerson partial-ticks))))

(defn render-overlays
  "partial-ticks - `float`"
  ([^ItemRenderer this ^Float partial-ticks]
    (-> this (.renderOverlays partial-ticks))))

(defn update-equipped-item
  ""
  ([^ItemRenderer this]
    (-> this (.updateEquippedItem))))

(defn reset-equipped-progress
  "hand - `net.minecraft.util.EnumHand`"
  ([^ItemRenderer this ^net.minecraft.util.EnumHand hand]
    (-> this (.resetEquippedProgress hand))))

