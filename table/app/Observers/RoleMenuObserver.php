<?php

namespace App\Observers;

use App\Models\RoleMenu;

class RoleMenuObserver
{
    /**
     * Handle the RoleMenu "created" event.
     */
    public function created(RoleMenu $roleMenu): void
    {
        //
    }

    /**
     * Handle the RoleMenu "updated" event.
     */
    public function updated(RoleMenu $roleMenu): void
    {
        //
    }

    /**
     * Handle the RoleMenu "deleted" event.
     */
    public function deleted(RoleMenu $roleMenu): void
    {
        //
    }

    /**
     * Handle the RoleMenu "restored" event.
     */
    public function restored(RoleMenu $roleMenu): void
    {
        //
    }

    /**
     * Handle the RoleMenu "force deleted" event.
     */
    public function forceDeleted(RoleMenu $roleMenu): void
    {
        //
    }
}
