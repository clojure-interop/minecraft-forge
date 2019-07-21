(ns net.minecraft.block.BlockPackedIce
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockPackedIce]))

(defn ->block-packed-ice
  "Constructor."
  (^BlockPackedIce []
    (new BlockPackedIce )))

(defn quantity-dropped
  "random - `java.util.Random`

  returns: `int`"
  (^Integer [^BlockPackedIce this ^java.util.Random random]
    (-> this (.quantityDropped random))))

