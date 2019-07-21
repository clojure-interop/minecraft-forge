(ns net.minecraft.command.ICommandListener
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.command ICommandListener]))

(defn notify-listener
  "sender - `net.minecraft.command.ICommandSender`
  command - `net.minecraft.command.ICommand`
  flags - `int`
  translation-key - `java.lang.String`
  translation-args - `java.lang.Object`"
  ([^ICommandListener this ^net.minecraft.command.ICommandSender sender ^net.minecraft.command.ICommand command ^Integer flags ^java.lang.String translation-key ^java.lang.Object translation-args]
    (-> this (.notifyListener sender command flags translation-key translation-args))))

