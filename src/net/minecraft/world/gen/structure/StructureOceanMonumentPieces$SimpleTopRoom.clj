(ns net.minecraft.world.gen.structure.StructureOceanMonumentPieces$SimpleTopRoom
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureOceanMonumentPieces$SimpleTopRoom]))

(defn ->simple-top-room
  "Constructor.

  p-i-45586-1 - `net.minecraft.util.EnumFacing`
  p-i-45586-2 - `net.minecraft.world.gen.structure.StructureOceanMonumentPieces.RoomDefinition`
  p-i-45586-3 - `java.util.Random`"
  (^StructureOceanMonumentPieces$SimpleTopRoom [^net.minecraft.util.EnumFacing p-i-45586-1 ^net.minecraft.world.gen.structure.StructureOceanMonumentPieces.RoomDefinition p-i-45586-2 ^java.util.Random p-i-45586-3]
    (new StructureOceanMonumentPieces$SimpleTopRoom p-i-45586-1 p-i-45586-2 p-i-45586-3))
  (^StructureOceanMonumentPieces$SimpleTopRoom []
    (new StructureOceanMonumentPieces$SimpleTopRoom )))

(defn add-component-parts
  "world-in - `net.minecraft.world.World`
  random-in - `java.util.Random`
  structure-bounding-box-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `boolean`"
  (^Boolean [^StructureOceanMonumentPieces$SimpleTopRoom this ^net.minecraft.world.World world-in ^java.util.Random random-in ^net.minecraft.world.gen.structure.StructureBoundingBox structure-bounding-box-in]
    (-> this (.addComponentParts world-in random-in structure-bounding-box-in))))

