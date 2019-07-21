(ns net.minecraft.world.gen.structure.StructureMineshaftStart
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureMineshaftStart]))

(defn ->structure-mineshaft-start
  "Constructor.

  p-i-47149-1 - `net.minecraft.world.World`
  p-i-47149-2 - `java.util.Random`
  p-i-47149-3 - `int`
  p-i-47149-4 - `int`
  p-i-47149-5 - `net.minecraft.world.gen.structure.MapGenMineshaft$Type`"
  (^StructureMineshaftStart [^net.minecraft.world.World p-i-47149-1 ^java.util.Random p-i-47149-2 ^Integer p-i-47149-3 ^Integer p-i-47149-4 ^net.minecraft.world.gen.structure.MapGenMineshaft$Type p-i-47149-5]
    (new StructureMineshaftStart p-i-47149-1 p-i-47149-2 p-i-47149-3 p-i-47149-4 p-i-47149-5))
  (^StructureMineshaftStart []
    (new StructureMineshaftStart )))

