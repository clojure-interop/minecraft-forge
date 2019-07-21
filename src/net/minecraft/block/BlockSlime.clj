(ns net.minecraft.block.BlockSlime
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockSlime]))

(defn ->block-slime
  "Constructor."
  (^BlockSlime []
    (new BlockSlime )))

(defn get-block-layer
  "returns: `net.minecraft.util.BlockRenderLayer`"
  (^net.minecraft.util.BlockRenderLayer [^BlockSlime this]
    (-> this (.getBlockLayer))))

(defn on-fallen-upon
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  entity-in - `net.minecraft.entity.Entity`
  fall-distance - `float`"
  ([^BlockSlime this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.entity.Entity entity-in ^Float fall-distance]
    (-> this (.onFallenUpon world-in pos entity-in fall-distance))))

(defn on-landed
  "world-in - `net.minecraft.world.World`
  entity-in - `net.minecraft.entity.Entity`"
  ([^BlockSlime this ^net.minecraft.world.World world-in ^net.minecraft.entity.Entity entity-in]
    (-> this (.onLanded world-in entity-in))))

(defn on-entity-walk
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  entity-in - `net.minecraft.entity.Entity`"
  ([^BlockSlime this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.entity.Entity entity-in]
    (-> this (.onEntityWalk world-in pos entity-in))))

