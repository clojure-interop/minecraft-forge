(ns net.minecraft.block.state.pattern.BlockPattern$PatternHelper
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block.state.pattern BlockPattern$PatternHelper]))

(defn ->pattern-helper
  "Constructor.

  pos-in - `net.minecraft.util.math.BlockPos`
  finger-in - `net.minecraft.util.EnumFacing`
  thumb-in - `net.minecraft.util.EnumFacing`
  lcache-in - `com.google.common.cache.LoadingCache`
  width-in - `int`
  height-in - `int`
  depth-in - `int`"
  (^BlockPattern$PatternHelper [^net.minecraft.util.math.BlockPos pos-in ^net.minecraft.util.EnumFacing finger-in ^net.minecraft.util.EnumFacing thumb-in ^com.google.common.cache.LoadingCache lcache-in ^Integer width-in ^Integer height-in ^Integer depth-in]
    (new BlockPattern$PatternHelper pos-in finger-in thumb-in lcache-in width-in height-in depth-in)))

(defn get-front-top-left
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^BlockPattern$PatternHelper this]
    (-> this (.getFrontTopLeft))))

(defn get-forwards
  "returns: `net.minecraft.util.EnumFacing`"
  (^net.minecraft.util.EnumFacing [^BlockPattern$PatternHelper this]
    (-> this (.getForwards))))

(defn get-up
  "returns: `net.minecraft.util.EnumFacing`"
  (^net.minecraft.util.EnumFacing [^BlockPattern$PatternHelper this]
    (-> this (.getUp))))

(defn get-width
  "returns: `int`"
  (^Integer [^BlockPattern$PatternHelper this]
    (-> this (.getWidth))))

(defn get-height
  "returns: `int`"
  (^Integer [^BlockPattern$PatternHelper this]
    (-> this (.getHeight))))

(defn translate-offset
  "palm-offset - `int`
  thumb-offset - `int`
  finger-offset - `int`

  returns: `net.minecraft.block.state.BlockWorldState`"
  (^net.minecraft.block.state.BlockWorldState [^BlockPattern$PatternHelper this ^Integer palm-offset ^Integer thumb-offset ^Integer finger-offset]
    (-> this (.translateOffset palm-offset thumb-offset finger-offset))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockPattern$PatternHelper this]
    (-> this (.toString))))

