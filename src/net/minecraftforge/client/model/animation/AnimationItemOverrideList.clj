(ns net.minecraftforge.client.model.animation.AnimationItemOverrideList
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.animation AnimationItemOverrideList]))

(defn ->animation-item-override-list
  "Constructor.

  model - `net.minecraftforge.client.model.IModel`
  state - `net.minecraftforge.common.model.IModelState`
  format - `net.minecraft.client.renderer.vertex.VertexFormat`
  baked-texture-getter - `com.google.common.base.Function`
  overrides - `net.minecraft.client.renderer.block.model.ItemOverrideList`"
  (^AnimationItemOverrideList [^net.minecraftforge.client.model.IModel model ^net.minecraftforge.common.model.IModelState state ^net.minecraft.client.renderer.vertex.VertexFormat format ^com.google.common.base.Function baked-texture-getter ^net.minecraft.client.renderer.block.model.ItemOverrideList overrides]
    (new AnimationItemOverrideList model state format baked-texture-getter overrides)))

(defn handle-item-state
  "original-model - `net.minecraft.client.renderer.block.model.IBakedModel`
  stack - `net.minecraft.item.ItemStack`
  world - `net.minecraft.world.World`
  entity - `net.minecraft.entity.EntityLivingBase`

  returns: `net.minecraft.client.renderer.block.model.IBakedModel`"
  (^net.minecraft.client.renderer.block.model.IBakedModel [^AnimationItemOverrideList this ^net.minecraft.client.renderer.block.model.IBakedModel original-model ^net.minecraft.item.ItemStack stack ^net.minecraft.world.World world ^net.minecraft.entity.EntityLivingBase entity]
    (-> this (.handleItemState original-model stack world entity))))

