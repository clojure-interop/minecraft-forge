(ns net.minecraft.block.BlockYellowFlower
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockYellowFlower]))

(defn ->block-yellow-flower
  "Constructor."
  (^BlockYellowFlower []
    (new BlockYellowFlower )))

(defn get-block-type
  "returns: `net.minecraft.block.BlockFlower$EnumFlowerColor`"
  (^net.minecraft.block.BlockFlower$EnumFlowerColor [^BlockYellowFlower this]
    (-> this (.getBlockType))))

