(ns net.minecraft.world.gen.structure.StructureComponentTemplate
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureComponentTemplate]))

(defn ->structure-component-template
  "Constructor.

  p-i-46662-1 - `int`"
  (^StructureComponentTemplate [^Integer p-i-46662-1]
    (new StructureComponentTemplate p-i-46662-1))
  (^StructureComponentTemplate []
    (new StructureComponentTemplate )))

(defn add-component-parts
  "world-in - `net.minecraft.world.World`
  random-in - `java.util.Random`
  structure-bounding-box-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `boolean`"
  (^Boolean [^StructureComponentTemplate this ^net.minecraft.world.World world-in ^java.util.Random random-in ^net.minecraft.world.gen.structure.StructureBoundingBox structure-bounding-box-in]
    (-> this (.addComponentParts world-in random-in structure-bounding-box-in))))

(defn offset
  "x - `int`
  y - `int`
  z - `int`"
  ([^StructureComponentTemplate this ^Integer x ^Integer y ^Integer z]
    (-> this (.offset x y z))))

