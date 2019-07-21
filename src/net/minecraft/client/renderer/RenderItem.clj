(ns net.minecraft.client.renderer.RenderItem
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer RenderItem]))

(defn ->render-item
  "Constructor.

  p-i-46552-1 - `net.minecraft.client.renderer.texture.TextureManager`
  p-i-46552-2 - `net.minecraft.client.renderer.block.model.ModelManager`
  p-i-46552-3 - `net.minecraft.client.renderer.color.ItemColors`"
  (^RenderItem [^net.minecraft.client.renderer.texture.TextureManager p-i-46552-1 ^net.minecraft.client.renderer.block.model.ModelManager p-i-46552-2 ^net.minecraft.client.renderer.color.ItemColors p-i-46552-3]
    (new RenderItem p-i-46552-1 p-i-46552-2 p-i-46552-3)))

(defn z-level
  "Instance Field.

  type: float"
  (^Float [^RenderItem this]
    (-> this .-zLevel)))

(defn on-resource-manager-reload
  "resource-manager - `net.minecraft.client.resources.IResourceManager`"
  ([^RenderItem this ^net.minecraft.client.resources.IResourceManager resource-manager]
    (-> this (.onResourceManagerReload resource-manager))))

(defn render-item-overlay-into-gui
  "fr - `net.minecraft.client.gui.FontRenderer`
  stack - `net.minecraft.item.ItemStack`
  x-position - `int`
  y-position - `int`
  text - `java.lang.String`"
  ([^RenderItem this ^net.minecraft.client.gui.FontRenderer fr ^net.minecraft.item.ItemStack stack ^Integer x-position ^Integer y-position ^java.lang.String text]
    (-> this (.renderItemOverlayIntoGUI fr stack x-position y-position text))))

(defn get-item-model-with-overrides
  "stack - `net.minecraft.item.ItemStack`
  world-in - `net.minecraft.world.World`
  entitylivingbase-in - `net.minecraft.entity.EntityLivingBase`

  returns: `net.minecraft.client.renderer.block.model.IBakedModel`"
  (^net.minecraft.client.renderer.block.model.IBakedModel [^RenderItem this ^net.minecraft.item.ItemStack stack ^net.minecraft.world.World world-in ^net.minecraft.entity.EntityLivingBase entitylivingbase-in]
    (-> this (.getItemModelWithOverrides stack world-in entitylivingbase-in))))

(defn render-item
  "stack - `net.minecraft.item.ItemStack`
  entitylivingbase-in - `net.minecraft.entity.EntityLivingBase`
  transform - `net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType`
  left-handed - `boolean`"
  ([^RenderItem this ^net.minecraft.item.ItemStack stack ^net.minecraft.entity.EntityLivingBase entitylivingbase-in ^net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType transform ^Boolean left-handed]
    (-> this (.renderItem stack entitylivingbase-in transform left-handed)))
  ([^RenderItem this ^net.minecraft.item.ItemStack stack ^net.minecraft.client.renderer.block.model.IBakedModel model]
    (-> this (.renderItem stack model))))

(defn is-not-rendering-effects-in-gui
  "is-not - `boolean`"
  ([^RenderItem this ^Boolean is-not]
    (-> this (.isNotRenderingEffectsInGUI is-not))))

(defn render-item-overlays
  "fr - `net.minecraft.client.gui.FontRenderer`
  stack - `net.minecraft.item.ItemStack`
  x-position - `int`
  y-position - `int`"
  ([^RenderItem this ^net.minecraft.client.gui.FontRenderer fr ^net.minecraft.item.ItemStack stack ^Integer x-position ^Integer y-position]
    (-> this (.renderItemOverlays fr stack x-position y-position))))

(defn render-item-and-effect-into-gui
  "p-184391-1 - `net.minecraft.entity.EntityLivingBase`
  p-184391-2 - `net.minecraft.item.ItemStack`
  p-184391-3 - `int`
  p-184391-4 - `int`"
  ([^RenderItem this ^net.minecraft.entity.EntityLivingBase p-184391-1 ^net.minecraft.item.ItemStack p-184391-2 ^Integer p-184391-3 ^Integer p-184391-4]
    (-> this (.renderItemAndEffectIntoGUI p-184391-1 p-184391-2 p-184391-3 p-184391-4)))
  ([^RenderItem this ^net.minecraft.item.ItemStack stack ^Integer x-position ^Integer y-position]
    (-> this (.renderItemAndEffectIntoGUI stack x-position y-position))))

(defn render-item-into-gui
  "stack - `net.minecraft.item.ItemStack`
  x - `int`
  y - `int`"
  ([^RenderItem this ^net.minecraft.item.ItemStack stack ^Integer x ^Integer y]
    (-> this (.renderItemIntoGUI stack x y))))

(defn should-render-item-in-3-d?
  "stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^RenderItem this ^net.minecraft.item.ItemStack stack]
    (-> this (.shouldRenderItemIn3D stack))))

(defn get-item-model-mesher
  "returns: `net.minecraft.client.renderer.ItemModelMesher`"
  (^net.minecraft.client.renderer.ItemModelMesher [^RenderItem this]
    (-> this (.getItemModelMesher))))

