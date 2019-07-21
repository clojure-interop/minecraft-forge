(ns net.minecraft.client.renderer.chunk.CompiledChunk
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.chunk CompiledChunk]))

(defn ->compiled-chunk
  "Constructor."
  (^CompiledChunk []
    (new CompiledChunk )))

(def *-dummy
  "Static Constant.

  type: net.minecraft.client.renderer.chunk.CompiledChunk"
  CompiledChunk/DUMMY)

(defn layer-started?
  "layer - `net.minecraft.util.BlockRenderLayer`

  returns: `boolean`"
  (^Boolean [^CompiledChunk this ^net.minecraft.util.BlockRenderLayer layer]
    (-> this (.isLayerStarted layer))))

(defn layer-empty?
  "layer - `net.minecraft.util.BlockRenderLayer`

  returns: `boolean`"
  (^Boolean [^CompiledChunk this ^net.minecraft.util.BlockRenderLayer layer]
    (-> this (.isLayerEmpty layer))))

(defn set-state
  "state-in - `net.minecraft.client.renderer.VertexBuffer$State`"
  ([^CompiledChunk this ^net.minecraft.client.renderer.VertexBuffer$State state-in]
    (-> this (.setState state-in))))

(defn get-state
  "returns: `net.minecraft.client.renderer.VertexBuffer$State`"
  (^net.minecraft.client.renderer.VertexBuffer$State [^CompiledChunk this]
    (-> this (.getState))))

(defn add-tile-entity
  "tile-entity-in - `net.minecraft.tileentity.TileEntity`"
  ([^CompiledChunk this ^net.minecraft.tileentity.TileEntity tile-entity-in]
    (-> this (.addTileEntity tile-entity-in))))

(defn visible?
  "facing - `net.minecraft.util.EnumFacing`
  facing-2 - `net.minecraft.util.EnumFacing`

  returns: `boolean`"
  (^Boolean [^CompiledChunk this ^net.minecraft.util.EnumFacing facing ^net.minecraft.util.EnumFacing facing-2]
    (-> this (.isVisible facing facing-2))))

(defn set-layer-started
  "layer - `net.minecraft.util.BlockRenderLayer`"
  ([^CompiledChunk this ^net.minecraft.util.BlockRenderLayer layer]
    (-> this (.setLayerStarted layer))))

(defn empty?
  "returns: `boolean`"
  (^Boolean [^CompiledChunk this]
    (-> this (.isEmpty))))

(defn set-visibility
  "visibility - `net.minecraft.client.renderer.chunk.SetVisibility`"
  ([^CompiledChunk this ^net.minecraft.client.renderer.chunk.SetVisibility visibility]
    (-> this (.setVisibility visibility))))

(defn get-tile-entities
  "returns: `java.util.List<net.minecraft.tileentity.TileEntity>`"
  (^java.util.List [^CompiledChunk this]
    (-> this (.getTileEntities))))

