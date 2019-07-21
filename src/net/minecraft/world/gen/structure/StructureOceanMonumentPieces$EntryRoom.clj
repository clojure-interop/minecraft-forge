(ns net.minecraft.world.gen.structure.StructureOceanMonumentPieces$EntryRoom
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureOceanMonumentPieces$EntryRoom]))

(defn ->entry-room
  "Constructor.

  p-i-45592-1 - `net.minecraft.util.EnumFacing`
  p-i-45592-2 - `net.minecraft.world.gen.structure.StructureOceanMonumentPieces.RoomDefinition`"
  (^StructureOceanMonumentPieces$EntryRoom [^net.minecraft.util.EnumFacing p-i-45592-1 ^net.minecraft.world.gen.structure.StructureOceanMonumentPieces.RoomDefinition p-i-45592-2]
    (new StructureOceanMonumentPieces$EntryRoom p-i-45592-1 p-i-45592-2))
  (^StructureOceanMonumentPieces$EntryRoom []
    (new StructureOceanMonumentPieces$EntryRoom )))

(defn add-component-parts
  "world-in - `net.minecraft.world.World`
  random-in - `java.util.Random`
  structure-bounding-box-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `boolean`"
  (^Boolean [^StructureOceanMonumentPieces$EntryRoom this ^net.minecraft.world.World world-in ^java.util.Random random-in ^net.minecraft.world.gen.structure.StructureBoundingBox structure-bounding-box-in]
    (-> this (.addComponentParts world-in random-in structure-bounding-box-in))))

