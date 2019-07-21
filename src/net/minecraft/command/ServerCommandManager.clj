(ns net.minecraft.command.ServerCommandManager
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.command ServerCommandManager]))

(defn ->server-command-manager
  "Constructor.

  server-in - `net.minecraft.server.MinecraftServer`"
  (^ServerCommandManager [^net.minecraft.server.MinecraftServer server-in]
    (new ServerCommandManager server-in)))

(defn notify-listener
  "sender - `net.minecraft.command.ICommandSender`
  command - `net.minecraft.command.ICommand`
  flags - `int`
  translation-key - `java.lang.String`
  translation-args - `java.lang.Object`"
  ([^ServerCommandManager this ^net.minecraft.command.ICommandSender sender ^net.minecraft.command.ICommand command ^Integer flags ^java.lang.String translation-key ^java.lang.Object translation-args]
    (-> this (.notifyListener sender command flags translation-key translation-args))))

