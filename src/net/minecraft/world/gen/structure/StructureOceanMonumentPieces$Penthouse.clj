(ns net.minecraft.world.gen.structure.StructureOceanMonumentPieces$Penthouse
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureOceanMonumentPieces$Penthouse]))

(defn ->penthouse
  "Constructor.

  p-i-45591-1 - `net.minecraft.util.EnumFacing`
  p-i-45591-2 - `net.minecraft.world.gen.structure.StructureBoundingBox`"
  (^StructureOceanMonumentPieces$Penthouse [^net.minecraft.util.EnumFacing p-i-45591-1 ^net.minecraft.world.gen.structure.StructureBoundingBox p-i-45591-2]
    (new StructureOceanMonumentPieces$Penthouse p-i-45591-1 p-i-45591-2))
  (^StructureOceanMonumentPieces$Penthouse []
    (new StructureOceanMonumentPieces$Penthouse )))

(defn add-component-parts
  "world-in - `net.minecraft.world.World`
  random-in - `java.util.Random`
  structure-bounding-box-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `boolean`"
  (^Boolean [^StructureOceanMonumentPieces$Penthouse this ^net.minecraft.world.World world-in ^java.util.Random random-in ^net.minecraft.world.gen.structure.StructureBoundingBox structure-bounding-box-in]
    (-> this (.addComponentParts world-in random-in structure-bounding-box-in))))

