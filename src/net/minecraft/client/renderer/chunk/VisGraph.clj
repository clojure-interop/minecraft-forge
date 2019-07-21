(ns net.minecraft.client.renderer.chunk.VisGraph
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.chunk VisGraph]))

(defn ->vis-graph
  "Constructor."
  (^VisGraph []
    (new VisGraph )))

(defn set-opaque-cube
  "pos - `net.minecraft.util.math.BlockPos`"
  ([^VisGraph this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.setOpaqueCube pos))))

(defn compute-visibility
  "returns: `net.minecraft.client.renderer.chunk.SetVisibility`"
  (^net.minecraft.client.renderer.chunk.SetVisibility [^VisGraph this]
    (-> this (.computeVisibility))))

(defn get-visible-facings
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `java.util.Set<net.minecraft.util.EnumFacing>`"
  (^java.util.Set [^VisGraph this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getVisibleFacings pos))))

