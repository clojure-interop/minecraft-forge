(ns net.minecraftforge.client.event.EntityViewRenderEvent
  "Event that hooks into EntityRenderer, allowing any feature to customize visual attributes
   the player sees."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event EntityViewRenderEvent]))

(defn ->entity-view-render-event
  "Constructor.

  renderer - `net.minecraft.client.renderer.EntityRenderer`
  entity - `net.minecraft.entity.Entity`
  state - `net.minecraft.block.state.IBlockState`
  render-partial-ticks - `double`"
  (^EntityViewRenderEvent [^net.minecraft.client.renderer.EntityRenderer renderer ^net.minecraft.entity.Entity entity ^net.minecraft.block.state.IBlockState state ^Double render-partial-ticks]
    (new EntityViewRenderEvent renderer entity state render-partial-ticks)))

(defn get-renderer
  "returns: `net.minecraft.client.renderer.EntityRenderer`"
  (^net.minecraft.client.renderer.EntityRenderer [^EntityViewRenderEvent this]
    (-> this (.getRenderer))))

(defn get-entity
  "returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^EntityViewRenderEvent this]
    (-> this (.getEntity))))

(defn get-state
  "returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^EntityViewRenderEvent this]
    (-> this (.getState))))

(defn get-render-partial-ticks
  "returns: `double`"
  (^Double [^EntityViewRenderEvent this]
    (-> this (.getRenderPartialTicks))))

