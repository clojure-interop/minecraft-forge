(ns net.minecraft.block.BlockRedFlower
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockRedFlower]))

(defn ->block-red-flower
  "Constructor."
  (^BlockRedFlower []
    (new BlockRedFlower )))

(defn get-block-type
  "returns: `net.minecraft.block.BlockFlower$EnumFlowerColor`"
  (^net.minecraft.block.BlockFlower$EnumFlowerColor [^BlockRedFlower this]
    (-> this (.getBlockType))))

