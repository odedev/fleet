<?php

namespace App\Observers;

use App\Models\ModelField;

class ModelFieldObserver
{
    /**
     * Handle the ModelField "created" event.
     */
    public function created(ModelField $modelField): void
    {
        //
    }

    /**
     * Handle the ModelField "updated" event.
     */
    public function updated(ModelField $modelField): void
    {
        //
    }

    /**
     * Handle the ModelField "deleted" event.
     */
    public function deleted(ModelField $modelField): void
    {
        //
    }

    /**
     * Handle the ModelField "restored" event.
     */
    public function restored(ModelField $modelField): void
    {
        //
    }

    /**
     * Handle the ModelField "force deleted" event.
     */
    public function forceDeleted(ModelField $modelField): void
    {
        //
    }
}
