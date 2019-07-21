(ns net.minecraft.world.gen.structure.StructureEndCityPieces
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureEndCityPieces]))

(defn ->structure-end-city-pieces
  "Constructor."
  (^StructureEndCityPieces []
    (new StructureEndCityPieces )))

(defn *register-pieces
  ""
  ([]
    (StructureEndCityPieces/registerPieces )))

(defn *start-house-tower
  "p-191087-0 - `net.minecraft.world.gen.structure.template.TemplateManager`
  p-191087-1 - `net.minecraft.util.math.BlockPos`
  p-191087-2 - `net.minecraft.util.Rotation`
  p-191087-3 - `java.util.List`
  p-191087-4 - `java.util.Random`"
  ([^net.minecraft.world.gen.structure.template.TemplateManager p-191087-0 ^net.minecraft.util.math.BlockPos p-191087-1 ^net.minecraft.util.Rotation p-191087-2 ^java.util.List p-191087-3 ^java.util.Random p-191087-4]
    (StructureEndCityPieces/startHouseTower p-191087-0 p-191087-1 p-191087-2 p-191087-3 p-191087-4)))

