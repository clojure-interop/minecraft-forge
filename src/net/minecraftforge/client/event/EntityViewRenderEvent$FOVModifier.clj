(ns net.minecraftforge.client.event.EntityViewRenderEvent$FOVModifier
  "Event that allows mods to alter the raw FOV itself.
  This directly affects to the FOV without being modified."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event EntityViewRenderEvent$FOVModifier]))

(defn ->fov-modifier
  "Constructor.

  renderer - `net.minecraft.client.renderer.EntityRenderer`
  entity - `net.minecraft.entity.Entity`
  state - `net.minecraft.block.state.IBlockState`
  render-partial-ticks - `double`
  fov - `float`"
  (^EntityViewRenderEvent$FOVModifier [^net.minecraft.client.renderer.EntityRenderer renderer ^net.minecraft.entity.Entity entity ^net.minecraft.block.state.IBlockState state ^Double render-partial-ticks ^Float fov]
    (new EntityViewRenderEvent$FOVModifier renderer entity state render-partial-ticks fov)))

(defn get-fov
  "returns: `float`"
  (^Float [^EntityViewRenderEvent$FOVModifier this]
    (-> this (.getFOV))))

(defn set-fov
  "fov - `float`"
  ([^EntityViewRenderEvent$FOVModifier this ^Float fov]
    (-> this (.setFOV fov))))

