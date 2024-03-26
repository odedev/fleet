<?php

namespace App\Observers;

use App\Models\Dictionary;

class DictionaryObserver
{
    /**
     * Handle the Dictionary "created" event.
     */
    public function created(Dictionary $dictionary): void
    {
        //
    }

    /**
     * Handle the Dictionary "updated" event.
     */
    public function updated(Dictionary $dictionary): void
    {
        //
    }

    /**
     * Handle the Dictionary "deleted" event.
     */
    public function deleted(Dictionary $dictionary): void
    {
        //
    }

    /**
     * Handle the Dictionary "restored" event.
     */
    public function restored(Dictionary $dictionary): void
    {
        //
    }

    /**
     * Handle the Dictionary "force deleted" event.
     */
    public function forceDeleted(Dictionary $dictionary): void
    {
        //
    }
}
