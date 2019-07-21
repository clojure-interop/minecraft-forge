(ns net.minecraftforge.client.event.EntityViewRenderEvent$RenderFogEvent
  "Event that allows any feature to customize the rendering of fog."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event EntityViewRenderEvent$RenderFogEvent]))

(defn ->render-fog-event
  "Constructor.

  renderer - `net.minecraft.client.renderer.EntityRenderer`
  entity - `net.minecraft.entity.Entity`
  state - `net.minecraft.block.state.IBlockState`
  render-partial-ticks - `double`
  fog-mode - `int`
  far-plane-distance - `float`"
  (^EntityViewRenderEvent$RenderFogEvent [^net.minecraft.client.renderer.EntityRenderer renderer ^net.minecraft.entity.Entity entity ^net.minecraft.block.state.IBlockState state ^Double render-partial-ticks ^Integer fog-mode ^Float far-plane-distance]
    (new EntityViewRenderEvent$RenderFogEvent renderer entity state render-partial-ticks fog-mode far-plane-distance)))

(defn get-fog-mode
  "returns: `int`"
  (^Integer [^EntityViewRenderEvent$RenderFogEvent this]
    (-> this (.getFogMode))))

(defn get-far-plane-distance
  "returns: `float`"
  (^Float [^EntityViewRenderEvent$RenderFogEvent this]
    (-> this (.getFarPlaneDistance))))

