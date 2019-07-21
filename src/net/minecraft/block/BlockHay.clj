(ns net.minecraft.block.BlockHay
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockHay]))

(defn ->block-hay
  "Constructor."
  (^BlockHay []
    (new BlockHay )))

(defn on-fallen-upon
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  entity-in - `net.minecraft.entity.Entity`
  fall-distance - `float`"
  ([^BlockHay this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.entity.Entity entity-in ^Float fall-distance]
    (-> this (.onFallenUpon world-in pos entity-in fall-distance))))

